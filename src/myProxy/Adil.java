package myProxy;

public class Adil implements CProgramming {
    Sujon sujon;

    @Override
    public void responsedRollCall() {
        if(sujon==null){
            sujon = new Sujon();
        }
        sujon.responsedRollCall();
    }
}
