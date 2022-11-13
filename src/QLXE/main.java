package QLXE;
import java.util.Objects;
import java.util.Scanner;

public class main {
    private static Bike[] Listbike;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            System.out.println("Quan Lý Xe");
            System.out.println("1.Nhập Loại Xe: ");
            System.out.println("2.Tìm Kiếm Tên Xe: ");
            System.out.println("3.Tìm kiếm mầu xe: ");
            System.out.println("4.Tìm kiếm theo năm sane xuất: ");
            System.out.println("5.Xóa xe khỏi danh sách: ");
            System.out.println("6.kết thúc chương trình");
            int so = Integer.parseInt(sc.nextLine());
            switch (so) {
                case 1:
                    Nhapvao();
                    break;
                case 2:
                    Timkiemtenxe();
                    break;
                case 3:
                    Timkiemmauxe();
                    break;
                case 4:
                    Timkiemtheonam();
                    break;
                case 5:
                    Xoasadanhsach();
                    break;
                default:
                    System.out.println("kết Thúc");
                    break;

            }
        }
    }

    private static void Nhapvao() {
        System.out.println("Moi ban nhap so luong bike can nhap: ");
        int so = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < so; i++) {
            System.out.println("mời bạn nhập vào loại xe: " + (i++));
            String bike = sc.nextLine();
            System.out.println("mời bạn nhập vào tên xe : " + (i++));
            String name = sc.nextLine();
            System.out.println("mời bạn nhập vào mầu của xe: " + (i++));
            String color = sc.nextLine();
            System.out.println("mời bạn nhập vào năm sản xuất: " + (i++));
            int year = Integer.parseInt(sc.nextLine());
            Bike bike1 = new Bike(bike, name, color, year);
            Listbike[i] = bike1;
        }
    }

    private static void Timkiemtenxe() {
        System.out.println("mời bạn nhập vào kiểu tìm kiếm: ");
        String name = sc.nextLine();
        System.out.println("kết quả tìm kiếm: ");
        for (int i = 0; i < Listbike.length; i++) {
            if (Listbike[i].getName().equals(name)) {
                Listbike[i].inttBIKE();
            }
        }
    }

    private static void Timkiemmauxe() {
        System.out.println("mời bạn nhập vào kiểu tìm kiếm: ");
        String color = sc.nextLine();
        System.out.println("kết quả tìm kiếm: ");
        for (int i = 0; i < Listbike.length; i++) {
            if (Listbike[i].getColor().equals(color)) {
                Listbike[i].inttBIKE();
            }
        }
    }

    private static void Timkiemtheonam() {
        System.out.println("mời bạn nhập vào kiểu tìm kiếm: ");
        String year = sc.nextLine();
        System.out.println("kết quả tìm kiếm: ");
        for (int i = 0; i < Listbike.length; i++) {
            if (!Objects.equals(Listbike[i].getYear(), year)) {
                continue;
            }
            Listbike[i].inttBIKE();
        }
    }
    private static int[] Xoasadanhsach(){
        System.out.println("mời bạn nhập bike cần xóa: ");
        String bike = sc.nextLine();
        int[] arr = new int[0];
        int[] anotherArray = new int[0];
        for (int i = 0, k = 0; i < arr.length; i++) {
            int index = 0;
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }
}

