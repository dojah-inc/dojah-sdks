/*
 * DOJAH Publilc APIs
 *
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Dojah.Net.Client.OpenAPIDateConverter;

namespace Dojah.Net.Model
{
    /// <summary>
    /// VerifyAgeResponseEntity
    /// </summary>
    [DataContract(Name = "VerifyAgeResponse_entity")]
    public partial class VerifyAgeResponseEntity : IEquatable<VerifyAgeResponseEntity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VerifyAgeResponseEntity" /> class.
        /// </summary>
        /// <param name="firstName">firstName.</param>
        /// <param name="lastName">lastName.</param>
        /// <param name="dateOfBirth">dateOfBirth.</param>
        /// <param name="verification">verification.</param>
        public VerifyAgeResponseEntity(string firstName = default(string), string lastName = default(string), string dateOfBirth = default(string), bool verification = default(bool))
        {
            this.FirstName = firstName;
            this.LastName = lastName;
            this.DateOfBirth = dateOfBirth;
            this.Verification = verification;
        }

        /// <summary>
        /// Gets or Sets FirstName
        /// </summary>
        [DataMember(Name = "first_name", EmitDefaultValue = false)]
        public string FirstName { get; set; }

        /// <summary>
        /// Gets or Sets LastName
        /// </summary>
        [DataMember(Name = "last_name", EmitDefaultValue = false)]
        public string LastName { get; set; }

        /// <summary>
        /// Gets or Sets DateOfBirth
        /// </summary>
        [DataMember(Name = "date_of_birth", EmitDefaultValue = false)]
        public string DateOfBirth { get; set; }

        /// <summary>
        /// Gets or Sets Verification
        /// </summary>
        [DataMember(Name = "verification", EmitDefaultValue = true)]
        public bool Verification { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class VerifyAgeResponseEntity {\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
            sb.Append("  DateOfBirth: ").Append(DateOfBirth).Append("\n");
            sb.Append("  Verification: ").Append(Verification).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as VerifyAgeResponseEntity);
        }

        /// <summary>
        /// Returns true if VerifyAgeResponseEntity instances are equal
        /// </summary>
        /// <param name="input">Instance of VerifyAgeResponseEntity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VerifyAgeResponseEntity input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FirstName == input.FirstName ||
                    (this.FirstName != null &&
                    this.FirstName.Equals(input.FirstName))
                ) && 
                (
                    this.LastName == input.LastName ||
                    (this.LastName != null &&
                    this.LastName.Equals(input.LastName))
                ) && 
                (
                    this.DateOfBirth == input.DateOfBirth ||
                    (this.DateOfBirth != null &&
                    this.DateOfBirth.Equals(input.DateOfBirth))
                ) && 
                (
                    this.Verification == input.Verification ||
                    this.Verification.Equals(input.Verification)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.FirstName != null)
                {
                    hashCode = (hashCode * 59) + this.FirstName.GetHashCode();
                }
                if (this.LastName != null)
                {
                    hashCode = (hashCode * 59) + this.LastName.GetHashCode();
                }
                if (this.DateOfBirth != null)
                {
                    hashCode = (hashCode * 59) + this.DateOfBirth.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Verification.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
