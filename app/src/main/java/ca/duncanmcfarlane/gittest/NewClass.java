package ca.duncanmcfarlane.gittest;

import java.util.ArrayList;

public class NewClass {
    /**
     * This is an update
     */
    private ArrayList<String> arrayList = new ArrayList<>();

    public NewClass(int intValue, String strValue) {
        arrayList.set(intValue, strValue);
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }
}
