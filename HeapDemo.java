public class HeapDemo {
    public static void main(String[] args) {
        MinHeap q = new MinHeap();
        q.add(new WorkOrder(1, "Yuki", 5, "express", "Jl. Ciganitri no.15"));
        q.add(new WorkOrder(2, "Kiki", 6, "kilat", "Jl. Pogor no.11"));
        q.add(new WorkOrder(3, "Toto", 7, "biasa", "Jl. Sukabirus no. 15"));
        q.add(new WorkOrder(4, "Juni", 8, "express", "Jl. Telekomunikasi no. 2"));
        q.add(new WorkOrder(5, "Julia", 8, "Same day", "Jl. Ciganitri no. 13"));
        q.add(new WorkOrder(6, "Agus", 9, "biasa", "Jl. Ciganitri no. 23"));

        while (q.size() > 0) {
            System.out.println(q.remove());
        }
    }
}
