public class Road {
    public static void main() {
        BMW bmw = new BMW();
        Mercedes mercedes = new Mercedes();
        CarRepoImpl carRepoImpl = new CarRepoImpl();
        bmw.setDriveSound("bip bip");
        mercedes.setDriveSound("pib pib");
        bmw.drive();
        mercedes.drive();
        bmw.setNewSound("vrym vrym");
        mercedes.setNewSound("vrrrrr");
        carRepoImpl.newSound(bmw);
    }
    public static void polimorf() {
        Car bmw = new BMW();
        Car mercedes = new Mercedes();
        bmw.drive();
        mercedes.drive();
    }
}