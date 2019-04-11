package EqualityEquration;

import java.util.*;

public class PossibleEquration {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        int N = Integer.parseInt(temp);
        String[] equrations = new String[N];
        for(int i=0;i<N;i++){
            temp = sc.nextLine();
            equrations[i] = temp;
        }
        System.out.println(equationsPossible(equrations));
    }


    public static boolean equationsPossible(String[] equations) {
            ArrayList<Integer>[] graph = new ArrayList[26];
            for (int i = 0; i < 26; ++i)
                graph[i] = new ArrayList();

            for (String eqn: equations) {
                if (eqn.charAt(1) == '=') {
                    int x = eqn.charAt(0) - 'a';
                    int y = eqn.charAt(3) - 'a';
                    graph[x].add(y);
                    graph[y].add(x);
                }
            }

            int[] color = new int[26];
            int t = 0;
            for (int start = 0; start < 26; ++start) {
                if (color[start] == 0) {
                    t++;
                    Stack<Integer> stack = new Stack();
                    stack.push(start);
                    while (!stack.isEmpty()) {
                        int node = stack.pop();
                        for (int nei: graph[node]) {
                            if (color[nei] == 0) {
                                color[nei] = t;
                                stack.push(nei);
                            }
                        }
                    }
                }
            }

            for (String eqn: equations) {
                if (eqn.charAt(1) == '!') {
                    int x = eqn.charAt(0) - 'a';
                    int y = eqn.charAt(3) - 'a';
                    if (x == y || color[x] != 0 && color[x] == color[y])
                        return false;
                }
            }

            return true;
        }
    }