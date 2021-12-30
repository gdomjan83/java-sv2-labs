package statemachine.typewriter;

public enum TypeWriterState {
    LOWERCASE {
        public TypeWriterState changeState() {
            return TypeWriterState.UPPERCASE;
        }
    },
    UPPERCASE {
        public TypeWriterState changeState() {
            return TypeWriterState.LOWERCASE;
        }
    };

    abstract TypeWriterState changeState();
}
