package be.vdab;

import be.vdab.domain.Car;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Hyuberuto on 07/07/15.
 */
public class CarMessageConverter extends AbstractHttpMessageConverter<Car> {

    public CarMessageConverter(){
        setSupportedMediaTypes(Arrays.asList(new MediaType("test/hyu")));
    }

    @Override
    protected boolean supports(Class<?> aClass) {
        return Car.class.isAssignableFrom(aClass);
    }

    @Override
    protected Car readInternal(Class<? extends Car> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    @Override
    protected void writeInternal(Car car, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {

    }
}
