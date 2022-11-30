package com.backbase.bestPictureAwards;

import com.backbase.bestPictureAwards.configuration.ConfigProperties;
import com.backbase.bestPictureAwards.enums.AwardStatusEnum;
import com.backbase.bestPictureAwards.exception.AcademyAwardNotFoundException;
import com.backbase.bestPictureAwards.model.entity.AcademyAward;
import com.backbase.bestPictureAwards.repository.AcademyAwardRepository;
import com.backbase.bestPictureAwards.service.AcademyAwardService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@SpringBootTest
public class AcademyAwardServiceStubTest {

    @Autowired
    private ConfigProperties configProperties;

    static class AcademyAwardRepositoryStub implements AcademyAwardRepository {

        @Override
        public List<AcademyAward> findAcademyAwardByAwardedAndCategory(AwardStatusEnum awardStatusEnum, String category) {
            return null;
        }

        @Override
        public List<AcademyAward> findAcademyAwardByAwarded(String category) {
            AcademyAward academyAward1 = new AcademyAward();
            academyAward1.setNominee("Movie Title 1");
            academyAward1.setCategory("Best Picture");
            AcademyAward academyAward2 = new AcademyAward();
            academyAward2.setNominee("Movie Title 2");
            academyAward2.setCategory("Best Picture");
            AcademyAward academyAward3 = new AcademyAward();
            academyAward3.setNominee("Movie Title 3");
            academyAward3.setCategory("Best Pictures");
            return List.of(academyAward1, academyAward2, academyAward3);
        }

        @Override
        public List<AcademyAward> findAcademyAwardByNomineeInAndCategory(List<String> movieTitles, String category) {
            return null;
        }

        @Override
        public Optional<AcademyAward> findAcademyAwardByNomineeAndYearLikeAndCategory(String movieTitle, String year, String category) {
            return Optional.empty();
        }

        @Override
        public List<AcademyAward> findAll() {
            return null;
        }

        @Override
        public List<AcademyAward> findAll(Sort sort) {
            return null;
        }

        @Override
        public Page<AcademyAward> findAll(Pageable pageable) {
            return null;
        }

        @Override
        public List<AcademyAward> findAllById(Iterable<Long> longs) {
            return null;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Long aLong) {

        }

        @Override
        public void delete(AcademyAward entity) {

        }

        @Override
        public void deleteAllById(Iterable<? extends Long> longs) {

        }

        @Override
        public void deleteAll(Iterable<? extends AcademyAward> entities) {

        }

        @Override
        public void deleteAll() {

        }

        @Override
        public <S extends AcademyAward> S save(S entity) {
            return null;
        }

        @Override
        public <S extends AcademyAward> List<S> saveAll(Iterable<S> entities) {
            return null;
        }

        @Override
        public Optional<AcademyAward> findById(Long aLong) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Long aLong) {
            return false;
        }

        @Override
        public void flush() {

        }

        @Override
        public <S extends AcademyAward> S saveAndFlush(S entity) {
            return null;
        }

        @Override
        public <S extends AcademyAward> List<S> saveAllAndFlush(Iterable<S> entities) {
            return null;
        }

        @Override
        public void deleteAllInBatch(Iterable<AcademyAward> entities) {

        }

        @Override
        public void deleteAllByIdInBatch(Iterable<Long> longs) {

        }

        @Override
        public void deleteAllInBatch() {

        }

        @Override
        public AcademyAward getOne(Long aLong) {
            return null;
        }

        @Override
        public AcademyAward getById(Long aLong) {
            return null;
        }

        @Override
        public <S extends AcademyAward> Optional<S> findOne(Example<S> example) {
            return Optional.empty();
        }

        @Override
        public <S extends AcademyAward> List<S> findAll(Example<S> example) {
            return null;
        }

        @Override
        public <S extends AcademyAward> List<S> findAll(Example<S> example, Sort sort) {
            return null;
        }

        @Override
        public <S extends AcademyAward> Page<S> findAll(Example<S> example, Pageable pageable) {
            return null;
        }

        @Override
        public <S extends AcademyAward> long count(Example<S> example) {
            return 0;
        }

        @Override
        public <S extends AcademyAward> boolean exists(Example<S> example) {
            return false;
        }

        @Override
        public <S extends AcademyAward, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
            return null;
        }
    }

    @Test
    public void shouldFindAllBestPicturesAwardMoviesWithStubbedRepository() throws AcademyAwardNotFoundException {

        //given
        AcademyAwardRepository academyAwardRepositoryStub =
                new AcademyAwardRepositoryStub();

        AcademyAwardService academyAwardService =
                new AcademyAwardService(academyAwardRepositoryStub, configProperties);

        //when
        List<AcademyAward> foundMovies =
                academyAwardService.findAllBestPictureCategoryMovies();

        //then
        Assertions.assertEquals(3, foundMovies.size());

    }
}
