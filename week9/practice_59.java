import java.util.Scanner;
import java.util.Random;

public class Practice_59 {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("10개의 난수를 발생시켜서 배열에 저장합니다.");
        printArray(arr);

        System.out.print("\n숫자 하나를 입력하세요: ");
        int k = sc.nextInt();

        try {
            int t = searchArray(arr, k);//예외를 던짐
            System.out.println("입력한 숫자 " + k + "는 배열의 " + (t + 1) + "번째에 있습니다.");
        } 
        catch (NotFoundException ex) {//예외 처리
            System.out.println(ex.getMessage());
        }

        sc.close();
    }

    public static int searchArray(int[] array, int key) throws NotFoundException {
        //출력문 사용 금지
    	int p = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                p = i;
                break;
            }
        }

        if (p == -1) {
            throw (new NotFoundException("입력한 숫자 " + key + "는 배열에 존재하지 않습니다."));
        }

        return p;
    }

    public static void printArray(int[] array) {
        Random rd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(101);
            System.out.print(array[i] + "\t");
        }
    }
}
