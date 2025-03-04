public class QuestionService {

    Questions[] questions = new Questions[5];

    public QuestionService(){
        questions[0] = new Questions(1,"What","1","2","3","4","2");
        questions[1] = new Questions(1,"Which","1","2","3","4","2");
        questions[2] = new Questions(1,"Where","1","2","3","4","2");
    }


    public void playQuiz(){
        System.out.println(questions[0].getOpt1());
        for(Questions p : questions){
            System.out.println(p);
        }

    }



}
