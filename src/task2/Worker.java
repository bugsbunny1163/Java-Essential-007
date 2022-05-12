package task2;

class Worker {
    String name;
    String position;
    int startYear;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Worker{");
        sb.append("name='").append(name).append('\'');
        sb.append(", position='").append(position).append('\'');
        sb.append(", startYear=").append(startYear);
        sb.append('}');
        return sb.toString();
    }
}
