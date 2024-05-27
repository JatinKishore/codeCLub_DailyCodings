/*
Optimizing Competition (100 Marks)
A thrilling boat competition is on the horizon, and N enthusiastic participants are eager to team up and participate. Each participant has a weight, represented by Wi.
However, there is a catch - the competition only allows teams consisting of two participants. As an organizer, you want to ensure fairness by allowing only teams with the same total weight.


For instance, if there are K teams, each comprising participants (a1, b1), (a2, b2), ..., (ak, bk),
where ai is the weight of the first participant in the i-th team, and bi is the weight of the second participant in the i-th team,
a key condition needs to be satisfied: a1 + b1 = a2 + b2 = ... = ak + bk = s, where s is the common total weight of each team.


Your challenge is to find an optimal value for s such that the maximum possible number of teams can be formed. 
It is important to note that each participant can only be part of one team.


Input Format
The first line contains an integer N, the number of participants.

The second line contains N space-separated integers W1, W2, ..., WN, where wi represents the weight of the i-th participant.



Constraints
1 ≤ N ≤ 50

1 ≤ Wi ≤ N



Output Format
Print the maximum number of teams that can be formed with the optimal total weight s.

Sample TestCase 1
Input
6
1 1 3 4 2 2
Output
2
Explanation

There are two possible cases:


Case 1: The value of s = 3

Two teams can be formed (1, 2) and (1, 2).


Case 2: The value of s = 4

Two teams can be formed (1, 3) and (2, 2).


In any case, the maximum number of valid teams formed are 2.


*/
import java.io.*;
import java.util.*;
public class Main {
   public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
      HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
      ArrayList<Integer> al = new ArrayList<>();
      int N = sc.nextInt();
      int[] arr = new int[N];
      for(int i=0;i<N;i++){
         arr[i] = sc.nextInt();
      }
      
      for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr.length;j++){
		        if(i==j){
		            continue;
		        }else{
                 int sum = arr[i] + arr[j];
		            if(hm.containsKey(sum)){
                     if(!hm.get(sum).contains(i) && !hm.get(sum)    .contains(j)){
                     
                     hm.get(sum).add(i);
                     hm.get(sum).add(j); 
                     }
                  }else{
                     ArrayList<Integer> u = new ArrayList<>();
                     u.add(i);
                     u.add(j);
                     hm.put(sum,u);
                  }
		        }
		        
		    }
		}

      int max=Integer.MIN_VALUE;

      for(Map.Entry<Integer, ArrayList<Integer>> i : hm.entrySet()){
         
         ArrayList<Integer> a = new ArrayList<>();
         a = i.getValue();
         max = a.size()>max?a.size():max;
         
      }

      System.out.print(max/2);
   }
}
