package caseStudy.designApen;

public class GelPen extends Pen implements RefilPen{
    private Refil refil;
    private boolean canChangeRefil;

    private GelPen(WriteStrategy writeStrategy){
        super(PenType.GEL,writeStrategy);
    }
    public static class Builder{
        private Refil refil;
        private boolean canChangeRefil;

        public WriteStrategy getWriteStrategy() {
            return writeStrategy;
        }

        public Builder setWriteStrategy(WriteStrategy writeStrategy) {
            this.writeStrategy = writeStrategy;
            return this;
        }

        private WriteStrategy writeStrategy;

        public GelPen build(){
            GelPen pen=new GelPen(this.writeStrategy);
            pen.refil=this.refil;
            pen.canChangeRefil=this.canChangeRefil;
            return pen;
        }

        public Refil getRefil() {
            return refil;
        }

        public Builder setRefil(Refil refil) {
            this.refil = refil;
            return this;
        }

        public boolean isCanChangeRefil() {
            return canChangeRefil;
        }

        public Builder setCanChangeRefil(boolean canChangeRefil) {
            this.canChangeRefil = canChangeRefil;
            return this;
        }
    }
    @Override
    public Refil getRefil() {
        return null;
    }

    @Override
    public boolean isRefil() {
        return false;
    }

    @Override
    public void canChangeRefil(Refil refil) {

    }

    @Override
    public Colour getColour() {
        return null;
    }
}
