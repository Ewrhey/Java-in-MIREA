class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Performing magic on the Magic Chair!");
    }

    @Override
    public void sit() {
        System.out.println("Sitting on a Magic Chair.");
    }
}