package stringbuffer.compare_string;

public class StringBufferWithStringBuilderComparator {

    public static double timeTookToConcatenateByStringBuilder(){
        StringBuilder sb = new StringBuilder();
        double startTime = System.nanoTime();
        for (int i=0; i<1_000_000; i++){
            sb.append("hello");
        }
        double endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static double timeTookToConcatenateByStringBuffer(){
        StringBuffer sb = new StringBuffer();
        double startTime = System.nanoTime();
        for (int i=0; i<1_000_000; i++){
            sb.append("hello");
        }
        double endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static void main(String[] args) {

        double timeByStringBuilder = timeTookToConcatenateByStringBuilder();
        double timeByStringBuffer = timeTookToConcatenateByStringBuffer();

        System.out.println("Time took by string builder: "+timeByStringBuilder);
        System.out.println("Time took by string buffer: "+timeByStringBuffer);

        if (timeByStringBuffer > timeByStringBuilder){
            System.out.println("StringBuilder was faster with "+(timeByStringBuffer-timeByStringBuilder));
        } else {
            System.out.println("StringBuffer was faster with "+(timeByStringBuilder - timeByStringBuffer));
        }

    }
}