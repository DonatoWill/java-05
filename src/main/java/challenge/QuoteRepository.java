package challenge;



import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends org.springframework.data.repository.Repository<Scripts, Integer> {

    Scripts findRandom();
    Scripts findByName(String actor);

}
