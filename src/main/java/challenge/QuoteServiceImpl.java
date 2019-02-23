package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Random;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	QuoteRepository quoteRepository;

	@Override
	public Quote getQuote() {
		Scripts script = quoteRepository.findRandom();
		return new Quote(script.getId(), script.getActor(), script.getDetail());
	}

	@Override
	public Quote getQuoteByActor(String actor) {
		Scripts script = quoteRepository.findByName(actor);
		return new Quote(script.getId(), script.getActor(), script.getDetail());
	}

}
