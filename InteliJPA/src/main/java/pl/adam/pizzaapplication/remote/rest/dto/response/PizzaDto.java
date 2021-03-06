package pl.adam.pizzaapplication.remote.rest.dto.response;

import pl.adam.pizzaapplication.domain.model.SizeType;

import java.math.BigDecimal;
import java.util.List;

public class PizzaDto
{
    private Integer id;
    private String name;
    private List<SizeDto> sizes;

    public PizzaDto()
    {

    }

    public PizzaDto(Integer id, String name, List<SizeDto> sizes)
    {
        this.id = id;
        this.name = name;
        this.sizes = sizes;
    }

    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        // void - brak typu zwróconego
        this.id = id;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public List<SizeDto> getSizes()
    {
        return sizes;
    }
    public void setSizes(List<SizeDto> sizes)
    {
        this.sizes = sizes;
    }
}
