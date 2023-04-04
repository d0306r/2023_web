package sec01.exam01;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
        System.out.println("dmbCellPhone.mode = " + dmbCellPhone.model);
        System.out.println("dmbCellPhone.color = " + dmbCellPhone.color);
        System.out.println("dmbCellPhone.channel = " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요");
        dmbCellPhone.sendVoice("반갑습니다.");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOffDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();
    }


}
