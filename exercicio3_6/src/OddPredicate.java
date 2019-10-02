class OddPredicate implements UnaryPredicate {

    @Override
    public boolean test(int i) {
        return i % 2 != 0;
    }


}

