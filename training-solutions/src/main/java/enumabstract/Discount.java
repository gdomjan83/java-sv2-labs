package enumabstract;

public enum Discount {
    SPECIAL_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            return pieces * price * 0.8;
        }
    }, BLACK_FRIDAY_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            if (pieces == 1 || pieces == 2) {
                return price * pieces * 0.75;
            } else if (pieces >= 3) {
                return (price * 0.5) + ((pieces - 1) * price * 0.75);
            } else {
                return  price * pieces;
            }
        }
    };

    public abstract double getAmountToPay(int price, int pieces);
}
