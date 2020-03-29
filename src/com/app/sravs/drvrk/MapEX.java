package com.app.sravs.drvrk;


import java.util.*;
import java.util.Map.Entry;

public class MapEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String, String> m=new HashMap<String, String>();
		m.put("1", "siva");
		m.put("2", "ranmu");
		m.put("3", "laxman");
		m.put("4", "hanuman");
		m.put("7", "raaaaaaaaam");
		//entrySet()-->keys and values
		Set<Entry<String,String>> kk=m.entrySet();
	System.out.println("with only map:"+m);
	System.out.println("with entryset:"+kk);
	
	System.out.println("-------with values() method");
	Collection<String> coll = m.values();
		System.out.println(coll);
		
		
		
		
		for(Map.Entry<String, String> mm:m.entrySet()){
			System.out.println(mm.getKey()+ " "+mm.getValue());
		}
		
		
		Map<String, String> n=new HashMap<String, String>();
		n.put("1", "siva");
		n.put("2", "ranmu");
		n.put("3", "laxman");
		n.put("4", "hanuman");
		n.put("7", "raaaaaaaaam");
		System.out.println("if u print only map:"+n);
		//keySet()-->retrives all keys
		Set <String> s=n.keySet();
		System.out.println("if u use keyset u gets only keys:"+s);
		for(String sk:s){
		System.out.println("if u wants to get values also while ur using keyset use get meothod:"+n.get(sk));
		}
				
		
		
		
		
	}

}
