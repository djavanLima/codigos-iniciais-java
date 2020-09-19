package br.com.oo.treino;

public class maiorDigito {


	public static void digito( int n) {
		Integer resultado;
		String digito=new String();
		if(n>=-80000 && n<=8000)
		{
			
		
			
			if(n>=0) {
			digito=Integer.toString(n);
			}
			
			else if(n<=0)
			{
				digito=Integer.toString((n*(-1)));
			}
				int[] temp=new int[digito.length()+1];
				char[] cadeia=new char[digito.length()+1];
				int aux;
				cadeia[digito.length()]='5';
				int fixo=digito.length();//ultima posicao
				
			if(n>=0) {	// valores positiovos
				
					for(int i=0; i< digito.length();i++) 
					{
						
						
							//temp[i]=Integer.valueOf(digito.charAt(i));
								cadeia[i]=digito.charAt(i);			
						
								
					}
					for(int i=0; i<= digito.length();i++) {
					
					
					System.out.println(temp[i]=Character.getNumericValue(cadeia[i]));
				
					
					System.out.println("Temp"+temp[i]);
					
					}
				
				for(int i=0;i<=digito.length();i++)
					{
						
						if(temp[fixo]>temp[i] && temp[fixo]==5)
						{
							System.out.println("temp"+temp[fixo]);
							aux=temp[i];
							temp[i]=temp[fixo];
							temp[fixo]=aux;
							
							
							//continuar
							
							for(int l=i+1;l<=digito.length();l++) {
								aux=temp[l];
								temp[l]=temp[fixo];
								temp[fixo]=aux;
								
							}
						}
						
					}
				
				for(int k=0; k<=fixo; k++) {
					//	int a;
						//char b;
							//cadeia[k]=;
								
								//a=temp[k];
								//b=(char)(a+'0');//gambiarra do java para conveter em  char kkkkkk
								//outra forma de converter char c=Character.forDigit(a,REDIX);  
								// a numero a ser convertido REDIX=10 CONSTANTE PARA DECIMAIS
								cadeia[k]=(char)(temp[k]+'0');
							
							}
						
						 resultado= (Integer.valueOf(String.copyValueOf(cadeia)));
						System.out.println("saida é: "+resultado);
			}
			
			//digito.valueOf(temp);
			//System.out.println(digito);
			
			
			if(n<=0) {	// valores negativos
				
				
				for(int i=0; i< digito.length();i++) 
				{
					
					temp[i]=Integer.valueOf(digito.charAt(i));
						System.out.println("aaaa"+temp[i]);
							cadeia[i]=digito.charAt(i);			
					
							
				}
				for(int i=0; i<= digito.length();i++) {
				
				
				System.out.println(temp[i]=Character.getNumericValue(cadeia[i]));
			
				
				
				
				}
			
			for(int i=0;i<=digito.length();i++)
				{
					
					if(temp[fixo]<temp[i] && temp[fixo]==5)
					{
						System.out.println("temp"+temp[fixo]);
						aux=temp[i];
						temp[i]=temp[fixo];
						temp[fixo]=aux;
						
						
						//continuar
						
						for(int l=i+1;l<=digito.length();l++) {
							aux=temp[l];
							temp[l]=temp[fixo];
							temp[fixo]=aux;
							
						}
					}
					
				}
			
			
			
			
			for(int k=0; k<=fixo; k++) {
		//	int a;
			//char b;
				//cadeia[k]=;
					
					//a=temp[k];
					//b=(char)(a+'0');//gambiarra do java para conveter em  char kkkkkk
					//outra forma de converter char c=Character.forDigit(a,REDIX);  
					// a numero a ser convertido REDIX=10 CONSTANTE PARA DECIMAIS
					cadeia[k]=(char)(temp[k]+'0');
				
				}
			
			 resultado= -1*(Integer.valueOf(String.copyValueOf(cadeia)));
			System.out.println("saida é: "+resultado);
		}
			
			
			
			
			
		}
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		maiorDigito.digito(860);
		
	}
	
	
	
	
}
