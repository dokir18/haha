public class SequenceList {
    final int N = 10;
    int a[]=new int[N];
    int n;//表长

    public void init() {
        for (int i = 0; i < N / 2; i++) {
            a[i] = i + 1;
        }
        n = N / 2;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void insert(int k, int x) {
        if (k <= 0 || k > n )
            return;
        for (int i = n; i >= k; i--) {
            a[i] = a[i - 1];
        }
        a[k - 1] = x;
        n++;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }

    public void delete(int k) {
        if (k < 1 || k > n)
            return;
        for (int i = k; i < n; i++) {
            a[i - 1] = a[i];
        }
        n--;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }


    }

    public static void main(String[] args) {
        SequenceList sequenceList = new SequenceList();
        sequenceList.init();
        sequenceList.insert(1, 44);
        sequenceList.insert(6, 22);
        System.out.println(sequenceList.a.length);
        sequenceList.delete(7);
    }
}
