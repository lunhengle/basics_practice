import java.util.ArrayList;
import java.util.List;

public class TestSolution {
    public static void main(String[] args) {
        System.out.println(2%2);
        int[][] moves={{0,0},{2,0},{1,1},{2,1},{2,2}};
        tictactoe(moves);
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList<>();
        List<Integer> preList=new ArrayList<>();
        preList.add(1);
        for(int i=1;i<rowIndex;i++){
            result.add(1);
            for(int j=1;j<i;j++){
                result.add(preList.get(j-1)+preList.get(j));
            }
            result.add(1);
            preList.clear();
            preList.addAll(result);
            result.clear();
        }
        return preList;
    }


    public static String tictactoe(int[][] moves) {
        int ac0=0;
        int ac1=0;
        int ac2=0;
        int ar0=0;
        int ar1=0;
        int ar2=0;

        int bc0=0;
        int bc1=0;
        int bc2=0;
        int br0=0;
        int br1=0;
        int br2=0;


        for(int i=0;i<moves.length;i++){
            int[] index=moves[i];
            if(index[0]==0){
                if(i%2==0){
                    ac0++;
                }else{
                    bc0++;
                }
            }else if(index[0]==1){
                if(i%2==0){
                    ac1++;
                }else{
                    bc1++;
                }
            }else {
                if(i%2==0){
                    ac2++;
                }else{
                    bc2++;
                }
            }
            if(index[1]==0){
                if(i%2==0){
                    ar0++;
                }else{
                    br0++;
                }
            }else if(index[1]==1){
                if(i%2==0){
                    ar1++;
                }else{
                    br1++;
                }
            }else {
                if(i%2==0){
                    ar2++;
                }else{
                    br2++;
                }
            }
        }
        if(ac0>=2||ac1>=2||ac2>=2){
            return "A";
        }else if(ar0>=2||ar1>=2||ar2>=2){
            return "A";
        }if(bc0>=2||bc1>=2||bc2>=2){
            return "B";
        }else if(br0>=2||br1>=2||br2>=2){
            return "B";
        }else if(ac0+ac1+ac2+ar0+ar1+ar2+bc0+bc1+bc2+br0+br1+br2==9){
            return "Draw";
        }else{
            return "Pending";
        }
    }
}
