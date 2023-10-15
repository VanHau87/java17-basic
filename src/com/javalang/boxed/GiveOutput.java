package com.javalang.boxed;

public class GiveOutput {
	Integer i = 1;  //i (bản gốc) chứa địa chỉ tham chiếu của 1 instance
	Condition condition = new Condition();
    
    public void cannotReassign(Integer i, Condition condition) {
    	//i (copy) này khác với i bên ngoài (i bản gốc), và giá trị của địa chỉ tham chiếu của i bên ngoài sẽ được copy vào i bên trong
    	System.out.println(condition);
    	System.out.println(i);
        i += 2;
        condition.lowerCase = 2;
    }
    public Integer canReassign(Integer i) {
        i += 2;
        return i;
    }
	public static void main(String[] args) {
		GiveOutput obj = new GiveOutput();
        System.out.println(obj.i);
        obj.cannotReassign(obj.i, obj.condition);
        System.out.println(obj.i);
        obj.i = obj.canReassign(obj.i);
        System.out.println(obj.i);
        System.out.println(obj.condition);
	}

}
