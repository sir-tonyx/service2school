package ee.service2school.form.grade;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-27T19:43:53+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
@Component
public class GradeMapperImpl implements GradeMapper {

    @Override
    public GradeDto toDto(Grade grade) {
        if ( grade == null ) {
            return null;
        }

        Integer gradeId = null;
        Integer gradeNumber = null;

        gradeId = grade.getId();
        gradeNumber = grade.getNumber();

        GradeDto gradeDto = new GradeDto( gradeId, gradeNumber );

        return gradeDto;
    }

    @Override
    public List<GradeDto> toDtos(List<Grade> grades) {
        if ( grades == null ) {
            return null;
        }

        List<GradeDto> list = new ArrayList<GradeDto>( grades.size() );
        for ( Grade grade : grades ) {
            list.add( toDto( grade ) );
        }

        return list;
    }
}
