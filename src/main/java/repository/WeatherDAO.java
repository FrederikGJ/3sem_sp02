package repository;

import config.HibernateConfig;
import model.WeatherEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

public class WeatherDAO {

    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactoryConfig();
    private static WeatherDAO weatherDAO = null;

    private WeatherDAO() {}

    public static WeatherDAO getInstance() {
        if (weatherDAO == null) {
            weatherDAO = new WeatherDAO();
        }
        return weatherDAO;
    }

    public WeatherEntity createWeather(WeatherEntity weather) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(weather);
            em.getTransaction().commit();
            em.close();
            return weather;
        }
    }

    public WeatherEntity readWeather(Long weatherId){
        try(EntityManager em = emf.createEntityManager()){
            WeatherEntity readWeather = em.find(WeatherEntity.class, weatherId);
            return readWeather;
        }
    }

    public WeatherEntity updateWeather(WeatherEntity weather){
        try (EntityManager em = emf.createEntityManager()){
            em.getTransaction().begin();
            WeatherEntity updatedWeather = em.merge(weather);
            em.getTransaction().commit();
            em.close();
            return updatedWeather;
        }
    }

    public void deleteWeather(Long weatherId) {
        try(EntityManager em = emf.createEntityManager()){
            em.getTransaction().begin();
            WeatherEntity weather = readWeather(weatherId);
            if(weather != null){
                em.remove(weather);
            }
            em.getTransaction().commit();
        }
    }


    public List<WeatherEntity> readAllWeather () {
        try (EntityManager em = emf.createEntityManager()) {
            List<WeatherEntity> locationEntities = em.createQuery("SELECT w FROM WeatherEntity w", WeatherEntity.class).getResultList();
            return locationEntities;
        }
    }

    
    public WeatherEntity getWeatherByLocationName(String locationName) {
        try (EntityManager em = emf.createEntityManager()) {
            WeatherEntity weatherEntity = em.createQuery("SELECT w FROM WeatherEntity w WHERE w.locationName = :locationName", WeatherEntity.class)
                    .setParameter("locationName", locationName)
                    .getSingleResult();
            return weatherEntity;
        }
    }





}
