package main.java.inhatc.cse.java.basic.chapter12.ex1_basic;

public class main {
    public static void main(String[] args) {

        // 1. 플라스틱 전용 3D 프린터 만들기
        // GenericPrinter에 <Plastic>을 붙여서 "이 프린터는 플라스틱만 씁니다"라고 정의합니다.
        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();

        // 플라스틱 재료 객체 생성
        Plastic plastic = new Plastic();

        // 프린터에 플라스틱 재료를 넣음 (세팅)
        plasticGenericPrinter.setMaterial(plastic);

        // (참고) 이 줄은 값을 가져오기만 하고 저장/출력을 안 해서 실제로는 아무 일도 일어나지 않아요!
        plasticGenericPrinter.getMaterial();

        // 프린터에서 재료를 꺼내서 meterial 변수에 담음
        // 제네릭 덕분에 꺼낼 때 자동으로 Plastic 타입인 것을 알고 있습니다.
        Plastic meterial = plasticGenericPrinter.getMaterial();

        // 꺼낸 재료로 출력 실행 (플라스틱의 doPrinting 메서드 호출)
        meterial.doPrinting();

        // 이전 질문에서 오버라이딩했던 toString()이 여기서 작동합니다! ("재료는 플라스틱" 출력)
        System.out.println(meterial);

        System.out.println("-------------------------"); // 구분선 (제가 임의로 추가했습니다)

        // 2. 파우더 전용 3D 프린터 만들기
        // 이번에는 같은 GenericPrinter지만 <Powder>를 붙여 파우더 전용으로 만듭니다.
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();

        // 파우더 재료 객체 생성
        Powder powder = new Powder();

        // 프린터에 파우더 재료를 넣음
        powderGenericPrinter.setMaterial(powder);

        // 프린터에서 재료를 꺼내서 meterial1 변수에 담음
        Powder meterial1 = powderGenericPrinter.getMaterial();

        // 꺼낸 재료로 출력 실행 (파우더의 doPrinting 메서드 호출)
        meterial1.doPrinting();

        // 파우더 객체의 정보 출력 ("재료는 파우더" 같은 문구가 나오겠죠?)
        System.out.println(meterial1);
    }
}