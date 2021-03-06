package model;


public class Container{

//Constantes

public final static char TANKCONTAINER = 't';
public final static char DRYVAN20  = 'a';
public final static char DRYVAN40 = 'b';
public final static double BASECOST = 2000000;
public final static double DAYCOSTBYARRIVING = 100000;
public final static double DAYCOSTBYLEAVING = 150000;

//Atributos

private String id;
private double weight;
private char type;
private String description;
private boolean arriving;
private int days;
private double cost;

//Constructor
public Container(String id, double weight,char type, String description,boolean arriving,int days){

this.id = id;
this.weight = weight;
this.type = type;
this.description = description;
this.arriving = arriving;
this.days = days;

}

public String InfoContainer(){

	String msj = "";

	msj += "----------------------------------------------------------------------------------------------------------------"+"\n";
	msj += "El id del contenedor es:" + id +"\n";
	msj += "----------------------------------------------------------------------------------------------------------------"+"\n";
	msj += "El peso del contenedor es:" + weight +"\n";
	msj += "----------------------------------------------------------------------------------------------------------------"+"\n";
	msj += "El tipo del contenedor es:" + type +"\n";
	msj += "----------------------------------------------------------------------------------------------------------------"+"\n";
	msj += "La descripcion es:" + description +"\n";
	msj += "----------------------------------------------------------------------------------------------------------------"+"\n";
	msj += "Si va de salida o no:" + arriving +"\n";
	msj += "----------------------------------------------------------------------------------------------------------------"+"\n";
	msj += "Los dias del contenedor son:" + getDays() +"\n";
	msj += "----------------------------------------------------------------------------------------------------------------"+"\n";
	msj += "El costo del contenedor es:" + calculatedCost() +"\n";
	msj += "----------------------------------------------------------------------------------------------------------------"+"\n";

	return msj;

}


//VERDADERO SI SALE, FALSO SI ENTRA

/*
*Este metodo va a calcular el costo de venida del contenedora

@return un costo de tipo double

**/
public double calculatedCost(){

double costOfThis = 0.0;
//Se sale del puerto
if(getInput() == true){

costOfThis = (BASECOST * weight) + (days * DAYCOSTBYLEAVING);
//Entra al puerto
}else if(getInput() == false){
  costOfThis = (days * DAYCOSTBYLEAVING);
}

return costOfThis;

}

public String getId(){
	return id;
}
public double getWeight(){
  return weight;
}

public boolean getInput(){
  return arriving;
}
public int getDays(){
  return days;
}
public char getType(){
  return type;
}








}
