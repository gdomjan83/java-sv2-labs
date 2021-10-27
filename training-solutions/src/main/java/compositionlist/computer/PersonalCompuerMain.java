package compositionlist.computer;

public class PersonalCompuerMain {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Amd Ryzen 5950X", 3.8);

        PersonalComputer pc = new PersonalComputer(cpu);

        pc.addHardware(new Hardware("Geforce RTX", "3060"));
        pc.addHardware(new Hardware("Creative", "SoundBlaster"));
        pc.addSoftware(new Software("Windows 10", 1.6));
        pc.addSoftware(new Software("GameMaker Studio 2", 2.6));

        System.out.println(pc.toString());
        System.out.println("CPU: " + pc.getCpu());
        System.out.println(pc.getHardwares().get(0).getName() +" " + pc.getHardwares().get(0).getModel());
        System.out.println(pc.getSoftwares().get(1). getName() + " " + pc.getSoftwares().get(1). getNumberOfVersion());
    }
}
