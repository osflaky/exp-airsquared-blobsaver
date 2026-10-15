/*
 * Copyright (c) 2021  airsquared
 *
 * This file is part of blobsaver.
 *
 * blobsaver is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * blobsaver is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with blobsaver.  If not, see <https://www.gnu.org/licenses/>.
 */

package airsquared.blobsaver.app;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("disable tests unless device is connected")
public class LibimobiledeviceTest extends BlobsaverTest {

    @Test
    public void getECID() throws LibimobiledeviceUtil.LibimobiledeviceException {
        System.out.println(LibimobiledeviceUtil.getECID());
    }

    @Test
    public void enterRecovery() throws LibimobiledeviceUtil.LibimobiledeviceException {
        LibimobiledeviceUtil.enterRecovery();
    }

    @Test
    public void getApNonce() throws LibimobiledeviceUtil.LibimobiledeviceException {
        System.out.println(LibimobiledeviceUtil.getApNonceNormalMode());
        System.out.println(LibimobiledeviceUtil.getGenerator());
    }

}
