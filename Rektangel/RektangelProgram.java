class RektangelProgram{
    public static void main(String[] args){
        Rektangel rektangel1 = new Rektangel(4.0,2.0);
        Rektangel rektangel2 = new Rektangel(2.0,3.0);
        System.out.println("Areal rektangel1: " + rektangel1.areal());
        System.out.println("Areal rektangel2: " + rektangel2.areal());
        rektangel1.oekBredde(1);
        rektangel2.oekLengde(1);
        System.out.println("Omkrets rektangel1: " + rektangel1.omkrets());
        System.out.println("Omkrets rektangel2: " + rektangel2.omkrets());
        System.out.println("");
        rektangel1.reduserLengde(1);
        System.out.println("Omkrets rektangel1: " + rektangel1.omkrets());
        rektangel1.reduserLengde(10);


    }
}
