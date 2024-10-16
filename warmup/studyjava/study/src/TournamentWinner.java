import java.util.*;

public class TournamentWinner {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        ArrayList<Integer> results = new ArrayList<Integer>();

        ArrayList<String> challengers1 = new ArrayList<String>();
        challengers1.add(String.valueOf('A'));
        challengers1.add(String.valueOf('B'));

        ArrayList<String> challengers2 = new ArrayList<String>();
        challengers2.add(String.valueOf('B'));
        challengers2.add(String.valueOf('C'));

        ArrayList<String> challengers3 = new ArrayList<String>();
        challengers3.add(String.valueOf('C'));
        challengers3.add(String.valueOf('A'));

        competitions.add(challengers1);
        competitions.add(challengers2);
        competitions.add(challengers3);

        results.add(0);
        results.add(0);
        results.add(1);

//        System.out.println(competitions);
//        System.out.println(results);



//        victories.put(String.valueOf('A'), 0);
//        victories.put(String.valueOf('B'), 0);
//        victories.put(String.valueOf('C'), 0);


//        System.out.println(victories);


        HashMap<String, Integer> victories = new HashMap<String, Integer>();
        for(int i = 0; i < competitions.size(); i++) {
            int result = results.get(i);
            ArrayList<String> arr = competitions.get(i);


            if(victories.containsKey(arr.get(0))) {

            }else {
                victories.put(arr.get(0), 0);
            }

            if(victories.containsKey(arr.get(1))) {

            }else {
                victories.put(arr.get(1), 0);
            }

            String winner;
            if(result == 1) {
                winner = String.valueOf(arr.get(0));
            }else {
                winner = String.valueOf(arr.get(1));
            }

            for(String s: victories.keySet()) {
                if(s.equals(winner)) {
                    int count = victories.get(s);
                    count++;
                    victories.put(s, count);
                }
            }


        }


//        System.out.println(victories);


        int max = 0;
        String winner = null;
        for (HashMap.Entry<String, Integer> set :
                victories.entrySet()) {
                max = Math.max(max, set.getValue());
        }

        for(HashMap.Entry<String, Integer> entry: victories.entrySet()) {
            if(entry.getValue() == max) {
                winner = entry.getKey();
            }
        }


    }

}
