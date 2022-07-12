package education-schema-be;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class test_soal2 {

    public static void main(String[] args) throws Exception {
        List<Object> list = new ArrayList<Object>(Arrays.asList(1, "ka", 67, "wah", "1772", "edukasi", 7, 98, -1));
        validationData(list);
    }

    public static void validationData(List<Object> list) throws Exception {

        if(list.size() == 0){
            throw new Exception("Data kosong");
        }

        for(int i = 0; i<list.size(); i++){
            if(list.get(i).getClass().getSimpleName().equals("Integer") && Integer.parseInt(list.get(i).toString()) < 0){
                System.out.println("index ke-" + i + " tidak bisa di validasi sistem");
            }else {
                System.out.println("index ke-" + i + " adalah " + list.get(i).getClass().getSimpleName() + " dengan data " + list.get(i));
            }
        }

    }

}
