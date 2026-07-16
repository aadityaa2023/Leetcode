class RecentCounter {

    ArrayList<Integer> list = new ArrayList<>();
    int start = 0;

    public int ping(int t) {
        list.add(t);

        while (list.get(start) < t - 3000) {
            start++;
        }

        return list.size() - start;
    }
}