package org.example.bitso.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import jakarta.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name="tokenId")
    public int tokenId;

    @Column(name = "userId")
    public int userId;

    @Column(name = "amount")
    public int amount;

    @Column(name = "date")
    public Date date;
}
