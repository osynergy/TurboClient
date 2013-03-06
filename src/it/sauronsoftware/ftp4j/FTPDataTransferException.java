/*******************************************************************************
 * Copyright (c) 2012, 2013 Vlad Mihalachi
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

/*
 * Copyright (c) 2013 Vlad Mihalachi.
 */

package it.sauronsoftware.ftp4j;

/**
 * Exception thrown if any I/O error occurs during a data transfer attempt.
 *
 * @author Carlo Pelliccia
 */
public class FTPDataTransferException extends Exception {

    private static final long serialVersionUID = 1L;

    public FTPDataTransferException() {
        super();
    }

    public FTPDataTransferException(String message, Throwable cause) {
        super(message, cause);
    }

    public FTPDataTransferException(String message) {
        super(message);
    }

    public FTPDataTransferException(Throwable cause) {
        super(cause);
    }

}
