package m_1.by.bsu.enums;

public enum TaxiStation {
    MERSEDES(10),TOYOTA(7),VOLVO;
    private int freeCabs;

    TaxiStation() {
    }

    TaxiStation(int freeCabs) {
        thistest.freeCabs = freeCabs;
    }

    public int getFreeCabs() {
        return freeCabs;
    }

    public void setFreeCabs(int freeCabs) {
        thistest.freeCabs = freeCabs;
    }
    @Override
    public String toString(){
        return  String.format("%s : free cabs = %d",name(),freeCabs);
    }
}
