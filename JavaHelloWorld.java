

package javahelloworld;

public class JavaHelloWorld {
    
   public static void main(String[] args) {
 
        System.out.println("merhaba java");
        
        int ogrenciSayisi=10;
        System.out.println("öğrenci sayım :" +ogrenciSayisi );
        
        int sayı=15;
        if(sayı<20){
            System.out.println("sayı 20'den küçüktür");
        }else if(sayı==20){
            System.out.println("sayı 20'e eşittir");
         }else{
             System.out.println("sayı 20'e eşittirden büyüktür");
       }
        
        
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 22;
        int enBuyuk = sayi1;
        if(enBuyuk<sayi2){
            enBuyuk= sayi2;
        }
        if(enBuyuk<sayi3){
            enBuyuk= sayi3;
        }
        
        System.out.println("en büyük sayı = "+enBuyuk);
        
        //switch
        char grade ='A';
        
        switch(grade){
            case 'A':
                System.out.println("mükemmel: geçtiniz");
                break;
            case 'B':
                System.out.println("çok güzel: geçtiniz");
                break;
            case 'C':
                System.out.println("iyi: geçtiniz");
                break;
            case 'D':
                System.out.println("fena değil: geçtiniz");
                break;
            case 'F':
                System.out.println("malesef kaldınız");
                break;
             default:
                System.out.println("geçersiz not girdiniz");
                break;
        }
        //for
        for(int i;i<=10;i+=2){
            System.out.println(i);
        }
        System.out.println("for döngüsü bitti");
        
        int i=1;
        //while
        while(i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("while döngüsü bitti");
        
        
        //do while
        int j=1;
        do{
             System.out.println(j);
             j+=2;
        }while(j<10);
        System.out.println("Do-while döngüsü bitti");
        
        String [] ogrenciler = new String[3];
        ogrenciler[0]="engin";
        ogrenciler[1]="derin";
        ogrenciler[2]="salih";
        
         for(int i;i<ogrenciler.lenght;i++){
            System.out.println(ogrenciler[i]);
        }
         for(String ogrenci:ogrenciler){
             System.out.println(ogrenci);
         }
         
         double[] myList={1.5,2.3,5.6};
         double total=0;
         double max=myList[0];
         for(double number:myList){
             if(max<number){
                 max=number;
             }
             total=total+number;
             System.out.println(number);  
         }
         System.out.println("toplam="+total);  
         System.out.println("En büyük="+max);  
         
         //çok boyutlu diziler
         String[][] sehirler =new String[3][3];
         
         sehirler[0][0]="istanbul";
         sehirler[0][1]="istanbul";
         sehirler[0][2]="istanbul";
         sehirler[1][0]="istanbul";
         sehirler[1][1]="istanbul";
         sehirler[1][2]="istanbul";
         sehirler[2][0]="istanbul";
         sehirler[2][1]="istanbul";
         sehirler[2][2]="istanbul";
         
         for(i=0;i<=2;i++){
             System.out.println("--------------"); 
             for(j=0;j<=2;j++){
                  System.out.println(sehirler[i][j]);  
                 
    }
          }
         
          asal mı
         
         int number=25;
         int remainder=number%2;
         boolean isPrime=true;
         
         if(number==1){
             System.out.println("sayı asal değildir");
             return;
         }
         if(number<1){
             System.out.println("geçersiz sayı");
         }
         
         for(int i=2;i<number;i++){
              if(number%i==0){
                isPrime=false;
               
              }
         }
         if(isPrime){
             System.out.println("sayı asaldır");
         }else{
             System.out.println("sayı asal değildir");
         }
   }
}
         
         //sesli harfler
          char harf = 'I';     
            switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(" kalın sesli harf");
                break;
            default;
                System.out.println("ince  sesli harf");
    
            //mükemmel sayı

           int number = 14;
	   int total = 0;
	   
	   for(int i = 1; i < number ; i++) {
		   if(number % i == 0) {
			   total= total + i;
		   }
	   }
	   if(number == total) {
		   System.out.println("Mukemmel Sayidir");
	   }else {
		   System.out.println("Mukemmel Sayi Degildir!");
	   }


            arkadaş sayılar
           
           int number1= 220;
	   int number2 = 284;
           int toplam1=0;
           int toplam2=0;
 	   
	   for(int i = 1; i < number1 ; i++) {
		   if(number1 % i == 0) {
			   toplam1= toplam1+ i;
		   }
	   }
           
            for(int i = 1; i < number2 ; i++) {
		   if(number2 % i == 0) {
			   toplam2= toplam2+ i;
 		   }
	   }
	   if(toplam1 == number2 && toplam2==number1 ) {
               System.out.println("bu iki sayı arkadaştır");
               	    
	   }else{
                System.out.println("bu iki sayı arkadaş değildir");
           }
		   
           
            sayı bulma
            int [] sayılar =new int[]{1,2,5,7,9,};
            int aranacak=5;

            boolean VarMi=false;
            
            for(int sayı:sayılar){
                 if(aranacak==sayı){
                    VarMi=true;
                    break;
            }             
            }
            if(VarMi){
                System.out.println("sayı mevcuttur");
            }else{
               System.out.println("sayı mevcut değildir"); 
            }
                
            }       
            
   }
