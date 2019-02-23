package challenge;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Random;

public class QuoteRepositoryImpl implements QuoteRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Scripts findRandom() {
        Query query = entityManager.createNativeQuery("SELECT id, actor, detail FROM scripts WHERE actor IS NOT NULL", Scripts.class);
        List<Scripts> scriptsList = query.getResultList();
        Scripts script = scriptsList.get(new Random().nextInt(scriptsList.size()));

        return script;
    }

    @Override
    public Scripts findByName(String actor) {
        Query query = entityManager.createNativeQuery("SELECT id, actor, detail FROM scripts WHERE actor = :actor AND actor IS NOT NULL", Scripts.class);
        query.setParameter("actor",actor);
        List<Scripts> scriptsList = query.getResultList();
        Scripts script = scriptsList.get(new Random().nextInt(scriptsList.size()));

        return script;
    }
}
