package chapter_18.page_727;

import net.mindview.util.Directory;

import java.io.File;
import java.io.IOException;

public class Program {

    public static void sumFilesSize(File root, String reg){
        double sumOfSizeFiles = 0;
        for(File files: Directory.walk(root,".*\\."+reg)){
            sumOfSizeFiles += files.length();

        }
        System.out.format("Size of all files "+sumOfSizeFiles);

    }

    public static class ProcessFiles{

        public interface Strategy{
            void process(File file);
        }

        private Strategy strategy;
        private String reg;

        public ProcessFiles(Strategy strategy, String reg) {
            this.strategy = strategy;
            this.reg = reg;
        }

        public void start(String[] args){
            try{
                if (args.length == 0)
                    processDirectoryTree(new File("."));
                else
                    for(String arg: args){
                        File fileArg = new File(arg);
                        if(fileArg.isDirectory())
                            processDirectoryTree(fileArg);
                        else{
                            if(!arg.endsWith("."+reg))
                                arg += "." + reg;
                            strategy.process(new File(arg).getCanonicalFile());
                        }
                    }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private void processDirectoryTree(File root) throws IOException {
            for(File file: Directory.walk(root.getAbsoluteFile(),".*\\."+reg))
                strategy.process(file.getCanonicalFile());
        }

    }

    public static void main(String[] args) {
        new ProcessFiles(new ProcessFiles.Strategy() {
            @Override
            public void process(File file) {

            }
        },".j");
        sumFilesSize(new File("src/main/java/net/mindview/util"),"java");
    }

}
