package com.wallet.repository;

import com.wallet.entity.Wallet;
import com.wallet.entity.WalletItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest
public class WalletItemRepositoryTest {

    public static final Date DATE = new Date();
    public static final String TYPE = "ENTRADA";
    public static final String DESCRIPTION = "Conta de luz";
    public static final BigDecimal VALUE = new BigDecimal(65);

    @Autowired
    WalletItemRepository repository;
    @Autowired
    WalletRepository walletRepository;

    @Test
    public void testSave(){
        Wallet w = new Wallet();

        w.setName("Carteira 1");
        w.setValue(BigDecimal.valueOf(500));
        walletRepository.save(w);

        WalletItem wi = new WalletItem(1L, w, DATE, TYPE, DESCRIPTION, VALUE);
        WalletItem response = repository.save(wi);
        assertNotNull(response);
        assertEquals(response.getDescription(), DESCRIPTION);
        assertEquals(response.getType(), TYPE);
        assertEquals(response.getWallet().getId(), w.getId());

    }


}
