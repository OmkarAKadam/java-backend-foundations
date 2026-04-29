class Question {
    private int id;
    private String question;
    private String opt[] = new String[4];
    private String answer;

    public Question(int id, String question, String opt[], String answer) {
        this.id = id;
        this.question = question;
        this.opt = opt;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOpt() {
        return opt;
    }

    public String getAnswer() {
        return answer;
    }
}