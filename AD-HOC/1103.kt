import java.util.Scanner
fun main(args: Array<String>) {
    val leer = Scanner(System.`in`)
    var minutos:Int
    var repetir:Boolean=true
    while (repetir){
        minutos=0
        val h1=leer.nextInt()
        val m1=leer.nextInt()
        val h2=leer.nextInt()
        val m2=leer.nextInt()
        if (h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0){
            repetir=false
            break
        } else {
            println(minutos(h1,m1,h2,m2,0))
        }

    }
}
fun minutos(hinicio:Int,minicio:Int,hfin:Int,mfin:Int,nminutos:Int): Int {
    if(hinicio==hfin && minicio==mfin && nminutos!=0){
        return nminutos
    }else{
        if(hinicio!=hfin){
            if (hinicio==23 && minicio==59){
                return minutos(0,0,hfin,mfin,nminutos+1)
            }else{
                if (minicio==59){
                    return  minutos(hinicio+1,0,hfin,mfin,nminutos+1)
                }else{
                    return minutos(hinicio,minicio+1,hfin,mfin,nminutos+1)
                }
            }

        }else{
            if (minicio>mfin){
               if(hinicio==23 && minicio==59){
                   return minutos(0,0,hfin,mfin,nminutos+1)
               }else{
                   if (minicio==59){
                       return  minutos(hinicio+1,0,hfin,mfin,nminutos+1)
                   }else {
                       return minutos(hinicio, minicio + 1, hfin, mfin, nminutos + 1)
                   }
               }
            }else{
                return minutos(hinicio, minicio + 1, hfin, mfin, nminutos + 1)
            }
        }
    }
}
