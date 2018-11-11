public class Main {

    public static void main(String[] args) {
        final String  st = "javav";
        duplicate(st);

    }

     static void duplicate(String s){
         char st;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
               st=s.charAt(i);
                if(i==j){
                    continue;
                }
                else if(st==s.charAt(j)){
                    System.out.println(st);
                    break;

                }

            }

        }

    }
}
