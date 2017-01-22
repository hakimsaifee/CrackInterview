package com.crack.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.crack.interview.entity.Question;
import com.crack.interview.entity.Technology;
import com.crack.interview.entity.Topic;
import com.crack.interview.repository.QuestionRepository;
import com.crack.interview.repository.TechnologyRepository;

/**
 * @author Hakim.s
 *
 */
/**
 * @author Hakim.s
 *
 */
/**
 * @author Hakim.s
 *
 */
@SpringBootApplication
@Configuration
@ComponentScan // works only pack below this.
public class Application {

	private static TechnologyRepository technologyRepository;
	private static QuestionRepository questionRepository;
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		technologyRepository = context.getBean(TechnologyRepository.class);
		questionRepository = context.getBean(QuestionRepository.class);
		addData();
	}

	/**
	 * 
	 */
	/**
	 * 
	 */
	private static void addData() {
		Technology tech = new Technology("JAVA");
		Topic topic = new Topic("Generics");
		Question ques = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic.addQuestion(ques );
		Question ques1 = new Question("Longest Possible Route in a Matrix with Hurdles", "Given an M x N matrix, with a few hurdles arbitrarily placed, calculate the length of longest possible route possible from source to destination within the matrix. We are allowed to move to only adjacent cells which are not hurdles. The route cannot contains any diagonal moves and a location once visited in a particular…");
		topic.addQuestion(ques1);
		Question ques2 = new Question("Find if array can be divided into two subarrays of equal sum", "Given a square matrix, find if it’s a Toeplitz matrix or not. A Toeplitz (or diagonal-constant) matrix is a matrix in which each descending diagonal from left to right is constant, i.e., all elements in a diagonal are same. In general, any n×n matrix mat[][] is a Toeplitz matrix if every cell mat[i][j] is same…");
		topic.addQuestion(ques2);

		Topic topic1 = new Topic("Multi-threading");
		Question topic1Ques1 = new Question("Threading Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic1.addQuestion(topic1Ques1 );
		Question topic1Ques2 = new Question("Threading Longest Possible Route in a Matrix with Hurdles", "Given an M x N matrix, with a few hurdles arbitrarily placed, calculate the length of longest possible route possible from source to destination within the matrix. We are allowed to move to only adjacent cells which are not hurdles. The route cannot contains any diagonal moves and a location once visited in a particular…");
		topic1.addQuestion(topic1Ques2);
		Question topic1Ques3 = new Question("Threading Find if array can be divided into two subarrays of equal sum", "Given a square matrix, find if it’s a Toeplitz matrix or not. A Toeplitz (or diagonal-constant) matrix is a matrix in which each descending diagonal from left to right is constant, i.e., all elements in a diagonal are same. In general, any n×n matrix mat[][] is a Toeplitz matrix if every cell mat[i][j] is same…");
		topic1.addQuestion(topic1Ques3);
		
		Topic topic2 = new Topic("String");
		Question topic2Ques1 = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic2.addQuestion(topic2Ques1);
		Question topic2Ques2 = new Question("Longest Possible Route in a Matrix with Hurdles", "Given an M x N matrix, with a few hurdles arbitrarily placed, calculate the length of longest possible route possible from source to destination within the matrix. We are allowed to move to only adjacent cells which are not hurdles. The route cannot contains any diagonal moves and a location once visited in a particular…");
		topic2.addQuestion(topic2Ques2);
		Question topic2Ques3 = new Question("Find if array can be divided into two subarrays of equal sum", "Given a square matrix, find if it’s a Toeplitz matrix or not. A Toeplitz (or diagonal-constant) matrix is a matrix in which each descending diagonal from left to right is constant, i.e., all elements in a diagonal are same. In general, any n×n matrix mat[][] is a Toeplitz matrix if every cell mat[i][j] is same…");
		topic2.addQuestion(topic2Ques3);
		Question topic2Ques4 = new Question("String Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic2.addQuestion(topic2Ques4);
		Question topic2Ques5 = new Question("String Longest Possible Route in a Matrix with Hurdles", "Given an M x N matrix, with a few hurdles arbitrarily placed, calculate the length of longest possible route possible from source to destination within the matrix. We are allowed to move to only adjacent cells which are not hurdles. The route cannot contains any diagonal moves and a location once visited in a particular…");
		topic2.addQuestion(topic2Ques5);
		Question topic2Ques6 = new Question("String Find if array can be divided into two subarrays of equal sum", "Given a square matrix, find if it’s a Toeplitz matrix or not. A Toeplitz (or diagonal-constant) matrix is a matrix in which each descending diagonal from left to right is constant, i.e., all elements in a diagonal are same. In general, any n×n matrix mat[][] is a Toeplitz matrix if every cell mat[i][j] is same…");
		topic2.addQuestion(topic2Ques6);
		
		
		Topic topic3 = new Topic("Collection");
		Question topic3Ques1 = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic3.addQuestion(topic3Ques1 );
		Question topic3Ques2 = new Question("Longest Possible Route in a Matrix with Hurdles", "Given an M x N matrix, with a few hurdles arbitrarily placed, calculate the length of longest possible route possible from source to destination within the matrix. We are allowed to move to only adjacent cells which are not hurdles. The route cannot contains any diagonal moves and a location once visited in a particular…");
		topic3.addQuestion(topic3Ques2);
		
		Topic topic4 = new Topic("Polymorphism");
		Question topic4Ques1 = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic4.addQuestion(topic4Ques1 );
		Question topic4Ques2 = new Question("Longest Possible Route in a Matrix with Hurdles", "Given an M x N matrix, with a few hurdles arbitrarily placed, calculate the length of longest possible route possible from source to destination within the matrix. We are allowed to move to only adjacent cells which are not hurdles. The route cannot contains any diagonal moves and a location once visited in a particular…");
		topic4.addQuestion(topic4Ques2);
		Question topic4Ques3 = new Question("Find if array can be divided into two subarrays of equal sum", "Given a square matrix, find if it’s a Toeplitz matrix or not. A Toeplitz (or diagonal-constant) matrix is a matrix in which each descending diagonal from left to right is constant, i.e., all elements in a diagonal are same. In general, any n×n matrix mat[][] is a Toeplitz matrix if every cell mat[i][j] is same…");
		topic4.addQuestion(topic4Ques3);
		
		Topic topic5 = new Topic("Interface");
		Question topic5Ques1 = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic5.addQuestion(topic5Ques1 );
		Question topic5Ques2 = new Question("Longest Possible Route in a Matrix with Hurdles", "Given an M x N matrix, with a few hurdles arbitrarily placed, calculate the length of longest possible route possible from source to destination within the matrix. We are allowed to move to only adjacent cells which are not hurdles. The route cannot contains any diagonal moves and a location once visited in a particular…");
		topic5.addQuestion(topic5Ques2);
		Question topic5Ques3 = new Question("Find if array can be divided into two subarrays of equal sum", "Given a square matrix, find if it’s a Toeplitz matrix or not. A Toeplitz (or diagonal-constant) matrix is a matrix in which each descending diagonal from left to right is constant, i.e., all elements in a diagonal are same. In general, any n×n matrix mat[][] is a Toeplitz matrix if every cell mat[i][j] is same…");
		topic5.addQuestion(topic5Ques3);
		
		Topic topic6 = new Topic("Inheritance");
		Question topic6Ques1 = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic6.addQuestion(topic6Ques1 );
		Question topic6Ques2 = new Question("Longest Possible Route in a Matrix with Hurdles", "Given an M x N matrix, with a few hurdles arbitrarily placed, calculate the length of longest possible route possible from source to destination within the matrix. We are allowed to move to only adjacent cells which are not hurdles. The route cannot contains any diagonal moves and a location once visited in a particular…");
		topic6.addQuestion(topic6Ques2);
		Question topic6Ques3 = new Question("Find if array can be divided into two subarrays of equal sum", "Given a square matrix, find if it’s a Toeplitz matrix or not. A Toeplitz (or diagonal-constant) matrix is a matrix in which each descending diagonal from left to right is constant, i.e., all elements in a diagonal are same. In general, any n×n matrix mat[][] is a Toeplitz matrix if every cell mat[i][j] is same…");
		topic6.addQuestion(topic6Ques3);
		
		Topic topic7 = new Topic("Abstraction");
		Question topic7Ques1 = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic7.addQuestion(topic7Ques1 );
		
		Topic topic8 = new Topic("Exception Handling");
		Question topic8Ques1 = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic8.addQuestion(topic8Ques1 );
		Question topic8Ques2 = new Question("Longest Possible Route in a Matrix with Hurdles", "Given an M x N matrix, with a few hurdles arbitrarily placed, calculate the length of longest possible route possible from source to destination within the matrix. We are allowed to move to only adjacent cells which are not hurdles. The route cannot contains any diagonal moves and a location once visited in a particular…");
		topic8.addQuestion(topic8Ques2);
		Question topic8Ques3 = new Question("Find if array can be divided into two subarrays of equal sum", "Given a square matrix, find if it’s a Toeplitz matrix or not. A Toeplitz (or diagonal-constant) matrix is a matrix in which each descending diagonal from left to right is constant, i.e., all elements in a diagonal are same. In general, any n×n matrix mat[][] is a Toeplitz matrix if every cell mat[i][j] is same…");
		topic8.addQuestion(topic8Ques3);
		Question topic8Ques4 = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic8.addQuestion(topic8Ques4 );
		Question topic8Ques5 = new Question("Longest Possible Route in a Matrix with Hurdles", "Given an M x N matrix, with a few hurdles arbitrarily placed, calculate the length of longest possible route possible from source to destination within the matrix. We are allowed to move to only adjacent cells which are not hurdles. The route cannot contains any diagonal moves and a location once visited in a particular…");
		topic8.addQuestion(topic8Ques5);
		Question topic8Ques6 = new Question("Find if array can be divided into two subarrays of equal sum", "Given a square matrix, find if it’s a Toeplitz matrix or not. A Toeplitz (or diagonal-constant) matrix is a matrix in which each descending diagonal from left to right is constant, i.e., all elements in a diagonal are same. In general, any n×n matrix mat[][] is a Toeplitz matrix if every cell mat[i][j] is same…");
		topic8.addQuestion(topic8Ques6);
		Question topic8Ques7 = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic8.addQuestion(topic8Ques7 );
		Question topic8Ques8 = new Question("Longest Possible Route in a Matrix with Hurdles", "Given an M x N matrix, with a few hurdles arbitrarily placed, calculate the length of longest possible route possible from source to destination within the matrix. We are allowed to move to only adjacent cells which are not hurdles. The route cannot contains any diagonal moves and a location once visited in a particular…");
		topic8.addQuestion(topic8Ques8);
		Question topic8Ques9 = new Question("Find if array can be divided into two subarrays of equal sum", "Given a square matrix, find if it’s a Toeplitz matrix or not. A Toeplitz (or diagonal-constant) matrix is a matrix in which each descending diagonal from left to right is constant, i.e., all elements in a diagonal are same. In general, any n×n matrix mat[][] is a Toeplitz matrix if every cell mat[i][j] is same…");
		topic8.addQuestion(topic8Ques9);
		
		Topic topic9 = new Topic("String Pool");
		Question topic9Ques1 = new Question("Threading Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic9.addQuestion(topic9Ques1 );
		Question topic9Ques2 = new Question("Threading Longest Possible Route in a Matrix with Hurdles", "Given an M x N matrix, with a few hurdles arbitrarily placed, calculate the length of longest possible route possible from source to destination within the matrix. We are allowed to move to only adjacent cells which are not hurdles. The route cannot contains any diagonal moves and a location once visited in a particular…");
		topic9.addQuestion(topic9Ques2);
		Question topic9Ques3 = new Question("Threading Find if array can be divided into two subarrays of equal sum", "Given a square matrix, find if it’s a Toeplitz matrix or not. A Toeplitz (or diagonal-constant) matrix is a matrix in which each descending diagonal from left to right is constant, i.e., all elements in a diagonal are same. In general, any n×n matrix mat[][] is a Toeplitz matrix if every cell mat[i][j] is same…");
		topic9.addQuestion(topic9Ques3);
		
		Topic topic10 = new Topic("Wrapper Class");
		Question topic10Ques1 = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic10.addQuestion(topic10Ques1);
		Question topic10Ques2 = new Question("Longest Possible Route in a Matrix with Hurdles", "Given an M x N matrix, with a few hurdles arbitrarily placed, calculate the length of longest possible route possible from source to destination within the matrix. We are allowed to move to only adjacent cells which are not hurdles. The route cannot contains any diagonal moves and a location once visited in a particular…");
		topic10.addQuestion(topic10Ques2);
		
		Topic topic11 = new Topic("Serialisation");
		Question topic11Ques1 = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic11.addQuestion(topic11Ques1 );

		Topic topic12 = new Topic("Data Type");
		Question topic12Ques1 = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic12.addQuestion(topic12Ques1 );

		Topic topic13 = new Topic("Synchronisation");
		Question topic13Ques1 = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic13.addQuestion(topic13Ques1 );

		Topic topic15 = new Topic("Date Time");
		Question topic15Ques1 = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic15.addQuestion(topic15Ques1 );

		Topic topic16 = new Topic("String Buffer");
		Question topic16Ques1 = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic16.addQuestion(topic16Ques1 );

		Topic topic17 = new Topic("Array");
		Question topic17Ques1 = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic17.addQuestion(topic17Ques1 );
		
		Topic topic18 = new Topic("Miscellaneous");
		Question topic18Ques1 = new Question("Minimax Algorithm in Game Theory | Set 4 (Alpha-Beta Pruning)", "Prerequisites: Minimax Algorithm in Game Theory, Evaluation Function in Game Theory Alpha-Beta pruning is not actually a new algorithm, rather an optimization technique for minimax algorithm. It reduces the computation time by a huge factor. This allows us to search much faster and even go into deeper levels in the game tree. It cuts off...");
		topic18.addQuestion(topic18Ques1 );

//		topic.addTechnology(tech);
//		topic = new Topic("Multi-threading");
		tech.addTopic(topic);
		tech.addTopic(topic1);
		tech.addTopic(topic2);
		tech.addTopic(topic3);
		tech.addTopic(topic4);
		tech.addTopic(topic5);
		tech.addTopic(topic6);
		tech.addTopic(topic7);
		tech.addTopic(topic8);
		tech.addTopic(topic9);
		tech.addTopic(topic10);
		tech.addTopic(topic11);
		tech.addTopic(topic12);
		tech.addTopic(topic13);
		tech.addTopic(topic15);
		tech.addTopic(topic16);
		tech.addTopic(topic17);
		tech.addTopic(topic18);

		technologyRepository.save(tech);
		Iterable<Question> quest = questionRepository.findAll();
		
		Question s = quest.iterator().next();
		System.out.println(s.getTopic().getName());
		
//		for (int i = 0; i < s.size(); i++) {
//			System.out.println(s.get(i).getName());
//		}
		
	}
}
