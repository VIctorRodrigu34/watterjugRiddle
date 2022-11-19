import java.lang.Math;
public class Jarras {


        public static void main(String []Args){
            int caso;
            int i = 0, x= 0, y=0;

            while(x!=2){
                caso = (int)(Math.random() * ( 8 - 1 ));
                switch(caso){
                    case 1:
                        //llenado de la jarra de 4
                        if(x!=4){
                            x=4;
                            y=y;
                            i++;
                            System.out.print("\n  "+i+": ("+x+","+y+")");

                        }
                        break;

                    case 2:
                        //lenado de la jarra de 3
                        if(y!=3){
                            x=x;
                            y=3;

                            i++;
                            System.out.print("\n "+ i+": ("+x+","+y+")");
                        }
                        break;

                    case 3:
                        //vaciado de la jarra de 4
                        if(x!=0){
                            x=0;
                            y=y;

                            i++;
                            System.out.print("\n "+i+": ("+x+","+y+")");
                        }
                        break;

                    case 4:
                        //vaciado de la jarra de 3
                        if(y!=0){
                            y=0;
                            x=x;
                            i++;
                            System.out.print("\n  "+i+": ("+x+","+y+")");
                        }
                        break;

                    case 5:
                        //si tienen contenido se iran vaciando
                        if(x!=0 && y!=3){
                            //se van vaciando uno por uno
                            while(x!=0 &&y!=3){
                                x--;
                                y++;
                            }
                            i++;
                            System.out.print("\n "+i+": ("+x+","+y+")");
                        }
                        break;

                    case 6:
                        //si tienen contenido se iran vaciando
                        if(y!=0 && x!=4){
                            //se van vaciando uno por uno
                            while(y!=0 &&x!=4){
                                y--;
                                x++;
                            }
                            i++;
                            System.out.print("\n  "+i+": ("+x+","+y+")");
                        }
                        break;

                    case 7:
                        //llenado con la jarra 3 de la otra jarra 4
                        if(x!=0){
                            y = y+x;
                            if(y>3){
                                x=3;
                            }
                            x=0;
                            i++;
                            System.out.print("\n "+i+": ("+x+","+y+")");
                        }
                        break;

                    case 8:
                        //llenado con la jarra 4 de la otra jarra 3
                        if(y!=0){
                            x=x+y;
                            if(x>4){
                                x=4;
                            }
                            y=0;
                            i++;
                            System.out.print("\n "+i+": ("+x+","+y+")");
                        }
                        break;

                }

            }

            System.out.print("\n Total: " + i);


        }

    }
