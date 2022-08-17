package com.oopsproject;
class Cars{
	public void CarsInfo()
	{
		System.out.println("class Cars");
	}
}
class Honda4 extends Cars{
	public void HondaModel()
	{
		System.out.println("class Honda");
	}

	
}
class Audii extends Cars{
	public void AudiiModel()
	{
		System.out.println("class Audii");
	}
}
class Bmw extends Cars{
	public void BmwModel()
	{
		System.out.println("class Bmw");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Honda4 h = new Honda4();
      Audii a = new Audii();
      Bmw b = new Bmw();
      
      h.HondaModel();
      a.CarsInfo();
      b.CarsInfo();
	}
	

}
