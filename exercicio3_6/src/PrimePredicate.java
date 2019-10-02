public class PrimePredicate implements UnaryPredicate{

    @Override
    public boolean test(int i) {
        if(i <=1)
            return false;
        // i só é divisivel por i e por 1
        int count = 0;

        for (int n = i; n>0 ; n--){
            if (i % n == 0)
                count++;
        }

        if (count == 2)
            return true;
        return false;
    }
}
