public class TesteGenerics_1 {

    interface GenericInterfaceOneType <T> {
        void perfomAction (final T action);
    }

    interface GenericInterfaceSeveralTypes <T,R> {
        R perfomAction (final T action);
    }

    public class ClassImplementingGenericInterface implements GenericInterfaceOneType <String> {

        @Override
        public void perfomAction(final String action) {
            // cenas
        }
    }
}
