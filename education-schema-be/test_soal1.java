class test_soal1 {

    public static void main(String[] args) throws Exception {
        int[] data =  {1, 2, 4, 3, 10, 11, 20, 5, 100, 200};
        fizzBuzz(data);
    }

    public static void fizzBuzz(int[] data) throws Exception {
        String print = "";
        boolean dua = false;

        if(data.length == 0){
            throw new Exception("Data kosong");
        }

        for(int i: data){
            if(i==5){
                print = "Fizz";
                print += dua? "Buzz": "";
            }
            if(i==11){
                print = "Buzz";
                dua = true;
            }
        }

        System.out.println(print);
    }

}